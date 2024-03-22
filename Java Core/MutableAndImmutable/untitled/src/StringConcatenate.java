import java.util.GregorianCalendar;

public class StringConcatenate {
    public static final int NUM_OF_ITEM = 10000;


        public static void main(String[] args) {
            System.gc();
            long start=new GregorianCalendar().getTimeInMillis();
            long startMemory=Runtime.getRuntime().freeMemory();
            StringBuffer sb1 = new StringBuffer();
            //StringBuilder sb = new StringBuilder();
            for(int i = 0; i<10000000; i++){
                sb1.append(":").append(i);
            }
            long end=new GregorianCalendar().getTimeInMillis();
            long endMemory=Runtime.getRuntime().freeMemory();
            System.out.println("Time Taken:"+(end-start));
            System.out.println("Memory used:"+(startMemory-endMemory));

            System.gc();
            long start2=new GregorianCalendar().getTimeInMillis();
            long startMemory2=Runtime.getRuntime().freeMemory();
            StringBuilder sb2 = new StringBuilder();
            //StringBuilder sb = new StringBuilder();
            for(int i = 0; i<10000000; i++){
                sb2.append(":").append(i);
            }
            long end2=new GregorianCalendar().getTimeInMillis();
            long endMemory2=Runtime.getRuntime().freeMemory();
            System.out.println("Time Taken:"+(end2-start2));
            System.out.println("Memory used:"+(startMemory2-endMemory2));


        }


}