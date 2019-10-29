package Task2EnvelopeCheck;

//TODO getSide(){give me number}  /
//todo Task2EnvelopeCheck.EnvelopeCheck(side1,side2);

class Envelope implements Comparable <Envelope> {

        private double envelope1side1;
        private double envelope1side2;
//        private double envelope2side1; //do we need envelope2?
//        private double envelope2side2; //do we need envelope2?

    public double getEnvelope1side1() {
        return envelope1side1;
    }
    public void setEnvelope1side1(double envelope1side1) {
        this.envelope1side1 = envelope1side1;
    }
    public double getEnvelope1side2() {
        return envelope1side2;
    }
    public void setEnvelope1side2(double envelope1side2) {
        this.envelope1side2 = envelope1side2;
    }
//    public double getEnvelope2side1() {
//        return envelope2side1;
//    }
//    public void setEnvelope2side1(double envelope2side1) {
//        this.envelope2side1 = envelope2side1;
//    }
//    public double getEnvelope2side2() {
//        return envelope2side2;
//    }
//    public void setEnvelope2side2(double envelope2side2) {
//        this.envelope2side2 = envelope2side2;
//    }

    public Envelope(double envelope1side1, double envelope1side2
//            , double envelope2side1, double envelope2side2
    ) {
        this.envelope1side1 = envelope1side1;
        this.envelope1side2 = envelope1side2;
//        this.envelope2side1 = envelope2side1;
//        this.envelope2side2 = envelope2side2;
    }

//    public Envelope() { //do i need  this constractor?
//    }

    public int compareTo(Envelope anotherEnvelope)
    {
        if (((this.envelope1side1 >= this.envelope1side2) && (this.envelope1side1 > anotherEnvelope.envelope1side1) && (envelope1side1 > envelope2side2) && (envelope1side2 > envelope2side2)&&(envelope2side2 > 0)&&(envelope2side1 > 0))
                || ((envelope2side1 >= envelope2side2) && (envelope2side1 > envelope1side1) && (envelope2side1 > envelope1side2) && (envelope2side2 > envelope1side2) &&(envelope1side1 > 0)&&(envelope1side2 > 0))
                || ((envelope1side2 > envelope1side1) && (envelope1side2 > envelope2side2) && (envelope1side2 > envelope2side1) && (envelope1side1 > envelope2side1) &&(envelope2side2 > 0)&&(envelope2side1 > 0))
                || ((envelope2side2 > envelope2side1) && (envelope2side2 > envelope1side2) && (envelope2side2 > envelope1side1) && (envelope2side1 > envelope1side1))&&(envelope1side1 > 0)&&(envelope1side2 > 0))
////        if (((a >= b) && (a > c) && (a > d) && (b > d)&&(d > 0)&&(c > 0))
////                || ((c >= d) && (c > a) && (c > b) && (d > b) &&(a > 0)&&(b > 0))
////                || ((b > a) && (b > d) && (b > c) && (a > c) &&(d > 0)&&(c > 0))
////                || ((d > c) && (d > b) && (d > a) && (c > a))&&(a > 0)&&(b > 0)) {
        return 1;
        } else if (this.envelope1side1 == anotherEnvelope.envelope1side1) {
            return -1;
        } else {
            return 0;
        }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Envelope{");
        sb.append("envelope1side1=").append(envelope1side1);
        sb.append(", envelope2side1=").append(envelope1side2);
//        sb.append(", envelope2side1='").append(envelope2side1);
//        sb.append(", envelope2side2=").append(envelope2side2);
        sb.append('}');
        return sb.toString();
    }

}

