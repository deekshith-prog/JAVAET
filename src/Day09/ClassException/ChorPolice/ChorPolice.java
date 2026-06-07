package Day09.ClassException.ChorPolice;

public class ChorPolice {

    class ChorCaught{
        int amount;

//        public ChorCaught(int amount) {
//            this.amount = amount;
//        }
        void chor(int amt,Boolean isCaught){
            if(amt<=0){
                throw new ArithmeticException("The Theif is Innocent");
            }
            if(isCaught){
                throw new Exception("The Theif is Caught");
            }
        }
    }
}