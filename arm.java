 class Armstrong {
    public static void main(String[] args) {
int num = 1634, originalNumber, rem, result = 0, n = 0;
originalNumber = num;
for (;originalNumber != 0; originalNumber /= 10, ++n);
originalNumber = num;
   for (;originalNumber != 0; originalNumber /= 10)
        {
            rem= originalNumber % 10;
            result += Math.pow(rem, n);
        }

        if(result == num)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
