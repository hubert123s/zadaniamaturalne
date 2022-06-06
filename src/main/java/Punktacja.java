public class Punktacja {



        private int punkt ;
        private int iloscpytan;

        public Punktacja(int punkt, int iloscpytan) {
                this.punkt = punkt;
                this.iloscpytan = iloscpytan;
        }

        public int getPunkt() {
                return punkt;
        }

        public void setPunkt(int punkt) {
                this.punkt += punkt;
        }

        public int getIloscpytan() {
                return iloscpytan;
        }

        public void setIloscpytan(int iloscpytan) {
                this.iloscpytan += iloscpytan;
        }

}
