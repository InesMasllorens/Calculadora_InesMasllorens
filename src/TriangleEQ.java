public class TriangleEQ {
    public class TriangleEQ extends Figura{

        private double base;
        private double altura;
        public TriangleEQ(double base, double altura){
            super();
            this.base = base;
            this.altura = altura;
        }
        public double GetArea(){

            return this.base*this.altura/2;
        }
}
