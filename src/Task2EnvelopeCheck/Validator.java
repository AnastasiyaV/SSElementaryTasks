package Task2EnvelopeCheck;

public class Validator {




//    protected boolean oneEnvelopeCanBePutIntoAnother()  throws RuntimeException {
//        if (((envelope1side1 >= envelope1side2) && (envelope1side1 > envelope2side1) && (envelope1side1 > envelope2side2) && (envelope1side2 > envelope2side2)&&(envelope2side2 > 0)&&(envelope2side1 > 0))
//                || ((envelope2side1 >= envelope2side2) && (envelope2side1 > envelope1side1) && (envelope2side1 > envelope1side2) && (envelope2side2 > envelope1side2) &&(envelope1side1 > 0)&&(envelope1side2 > 0))
//                || ((envelope1side2 > envelope1side1) && (envelope1side2 > envelope2side2) && (envelope1side2 > envelope2side1) && (envelope1side1 > envelope2side1) &&(envelope2side2 > 0)&&(envelope2side1 > 0))
//                || ((envelope2side2 > envelope2side1) && (envelope2side2 > envelope1side2) && (envelope2side2 > envelope1side1) && (envelope2side1 > envelope1side1))&&(envelope1side1 > 0)&&(envelope1side2 > 0)) {
////        if (((a >= b) && (a > c) && (a > d) && (b > d)&&(d > 0)&&(c > 0))
////                || ((c >= d) && (c > a) && (c > b) && (d > b) &&(a > 0)&&(b > 0))
////                || ((b > a) && (b > d) && (b > c) && (a > c) &&(d > 0)&&(c > 0))
////                || ((d > c) && (d > b) && (d > a) && (c > a))&&(a > 0)&&(b > 0)) {
//            return true;
//        } else {
//            return false;
//        }
//    };


        try{
        envelopeCheck.getParameters();
        boolean checkResult = envelopeCheck.oneEnvelopeCanBePutIntoAnother();
        System.out.println("It is possible to put one envelope into another - "+checkResult);





    }
