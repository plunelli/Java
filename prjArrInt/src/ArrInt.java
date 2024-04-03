
    public class ArrInt {
        private int[] arrayInt;
        private int dLogica;

        public ArrInt (int dFisica) {
            this.arrayInt = new int[dFisica];
            this.dLogica = 0;
        }

        public void add(int x){
            arrayInt[dLogica] = x;
            dLogica++;

        }

        public void remove() {
            arrayInt[dLogica] = 0;
            dLogica--;
        }

        public int getElement(int i)
        {
            return arrayInt[i];
        }

        public void removeElement(int i){
            shiftSX(i);
            dLogica--;
        }

        public void addElement(int i, int x) {
            shiftDX(i);
            arrayInt[i] = x;
            dLogica++;
        }

        private void shiftDX(int h) {
            int c;
            for (int j = dLogica; j > h; j--) {
                    arrayInt[j] = arrayInt[j-1];
            }

        }

        private void shiftSX(int h) {

            for (int j = h; j < dLogica; j++) {

                arrayInt[j]=arrayInt[j+1];
            }

        }

        public int[] getArrayInt() {
            int [] ar1 = new int[arrayInt.length];

            for (int i = 0; i < arrayInt.length; i++) {
                ar1[i] = arrayInt[i];
            }

            return ar1;
        }

        public int getdLogica() {
            return dLogica;
        }

        public String stampa() {
            String txt = "";
            for (int i = 0; i < dLogica; i++) {
                txt += "Alla posizione " + i + ", c'è " + arrayInt[i] + "\n";

            }

            txt += "la dimensione logica è " + dLogica + ", la dimensione fisica è " + arrayInt.length +"\n\n";

            return txt;

        }
    }


