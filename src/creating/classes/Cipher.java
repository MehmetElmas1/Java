package creating.classes;

public class Cipher {
        private String text;
        private int shift;

        public Cipher(){
            this.text ="java";
            this.shift =1; /// defult
        }

        public Cipher(String text, int shift){
            this.text = text;
            this.shift =shift;

        }
        public void setText(String newText){  ///not shift
            this.text =newText;
        }
        public String getText(){
            return this.text;
        }

        public int getShift(){
            return this.shift;
        }

        public String cipherText(){
            String result ="";
            char letter;
            for (int i = 0; i <this.text.length(); i++) {
                letter= this.text.charAt(i);
                letter+=this.shift;
                result+=letter;
            }
            return result;
        }
        
}

