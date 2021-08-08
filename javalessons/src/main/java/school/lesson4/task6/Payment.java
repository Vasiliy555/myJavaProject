package school.lesson4.task6;

public class Payment {
    class Shoes {
        private boolean isBuy = true;
        public void buy(){
            System.out.println("Ботинки -покупка совершена");
        }
    }
    class Dress {
        private boolean isBuy = true;
        public void buy(){
            System.out.println("Платье-покупка совершена");
        }
    }
    class Socks {
        private boolean isBuy = true;
        public void buy(int sm){
            System.out.printf("Носки - кол-во %s - покупка совершена", sm);
            System.out.println();
        }
    }
    class Shirt {
        private boolean isBuy = true;

        public void buy( String m,int sm) {
            System.out.printf("Рубашка %s - фирмы, кол-во %s - покупка совершена", m,sm);
            System.out.println();
        }
    }
    Shoes s1= new Shoes();
    Dress d1= new Dress();
    Socks sc1=new Socks();
    Shirt sh1= new Shirt();
}
