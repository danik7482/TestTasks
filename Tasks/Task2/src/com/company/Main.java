<<<<<<< HEAD
package com.company;

public class Main {
    public static void main (String[] args) {
        for(int i = 2; i < 100; ++i){
            int count = 0;
            for(int j = 2; j <=i && count < 2;++j){
                if(i%j==0){
                    ++count;
                }
            }
            if(count<2)
                System.out.println(i);
        }
    }
}
=======
package com.company;

public class Main {
    public static void main (String[] args) {
        for(int i = 2; i < 100; ++i){
            int count = 0;
            for(int j = 2; j <=i && count < 2;++j){
                if(i%j==0){
                    ++count;
                }
            }
            if(count<2)
                System.out.println(i);
        }
    }
}
>>>>>>> 86bafe84785c30c602aab861e2122e84437b1ad1
