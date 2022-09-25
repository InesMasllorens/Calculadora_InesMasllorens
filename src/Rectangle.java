public class Rectangle {
    public  class Rectangle extends Figura {

        private double base;
        private double altura;

        public Rectangle(double base, double altura){
            super();
            this.b = base;
            this.a = altura;
        }
        public double GetArea(){
            return this.a*this.b;
        }
}
