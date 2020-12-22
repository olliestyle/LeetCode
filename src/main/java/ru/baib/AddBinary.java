package ru.baib;

/**
 * Runtime: 2 ms, faster than 72.46% of Java online submissions for Add Binary.
 * Memory Usage: 37.5 MB, less than 94.88% of Java online submissions for Add Binary.
 */
public class AddBinary {
    public static String addBinaryMine(String a, String b) {
        StringBuilder res = new StringBuilder("");
        int temp = 0;
        int al = a.length() - 1;
        int bl = b.length() - 1;

        while (al >= 0 || bl >= 0) {
            int av = 0;
            int bv = 0;
            if (al >= 0) {
                av = a.charAt(al) == '0' ? 0 : 1;
            }
            if (bl >= 0) {
                bv = b.charAt(bl) == '0' ? 0 : 1;
            }

            if (av == 1 && bv == 1) {
                if (temp == 0) {
                    res.append("0");
                } else {
                    res.append("1");
                }
                temp = 1;
            } else if ((av == 1 && bv == 0) || (av == 0 && bv == 1)) {
                if (temp == 0) {
                    res.append("1");
                } else {
                    res.append("0");
                    temp = 1;
                }
            } else {
                if (temp == 0) {
                    res.append("0");
                } else {
                    res.append("1");
                    temp = 0;
                }
            }
            al--;
            bl--;
        }
        if (temp == 1) {
            res.append("1");
        }
        return res.reverse().toString();
    }

    public static String addBinaryInt(String a, String b) {
        if(a==null || a.length()==0)
            return b;
        if(b==null || b.length()==0)
            return a;

        int pa = a.length()-1;
        int pb = b.length()-1;

        int flag = 0;
        StringBuilder sb = new StringBuilder();
        while(pa >= 0 || pb >=0){
            int va = 0;
            int vb = 0;

            if(pa >= 0){
                va = a.charAt(pa)=='0'? 0 : 1;
                pa--;
            }
            if(pb >= 0){
                vb = b.charAt(pb)=='0'? 0: 1;
                pb--;
            }

            int sum = va + vb + flag;
            if(sum >= 2){
                sb.append(String.valueOf(sum-2));
                flag = 1;
            }else{
                flag = 0;
                sb.append(String.valueOf(sum));
            }
        }

        if(flag == 1){
            sb.append("1");
        }

        String reversed = sb.reverse().toString();
        return reversed;
    }
}
