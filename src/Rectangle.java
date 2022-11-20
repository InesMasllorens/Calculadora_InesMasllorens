public class Rectangle {
    public  class Rectangle extends Figura {

        private double base;
        private double altura;

        public Rectangle(double base, double altura){
            super();
            this.base = base;
            this.altura = altura;
        }
        public double GetArea(){

            return this.altura*this.base;
        }
}
