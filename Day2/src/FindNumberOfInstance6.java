     class FindNumberOfInstance {
         static int  count = 0;
        public FindNumberOfInstance(){
            count++;
        }
    }
    class FindNumber{
        public static void main(String[] args) {
            FindNumberOfInstance findNumberOfInstance = new FindNumberOfInstance();
            FindNumberOfInstance findNumberOfInstance1 = new FindNumberOfInstance();
            System.out.println("Number of instances found is " + FindNumberOfInstance.count);
        }
    }