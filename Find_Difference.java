public static void findDifference(int[] array){
    int[] difference = new int [array.length]
    for(Integer i=0;i<array.length;++){
        difference[i]=array[i]-findAvarage(array);

    }
    for(Integer i=0;i<difference.length;i++){
        System.out.print(difference[i]+ " ")
    }
}