class Node { 
    int basinID;
    int pfafCode;
    int lengthLeft;
    int lengthRight;

    Node left, right; 
  
    public Node(int uniqueBasinID, int lengthToLeftChild, int lengthToRightChild) { 
        basinID = uniqueBasinID;
        pfafCode = -1;
        lengthLeft = lengthToLeftChild;
        lengthRight = lengthToRightChild;
        left = right = null; 
    } 
} 

public class pafseysi{

    //public int[] getData(File excel)

//                        ID  A  B   BS O  C  LENGTH   B=> Start    A=>end
static int[][] testdata ={{1, 1, 15, 1, 1, 8, 23689},
                    {2, 2, 5, 1, 1, 8, 3475},
                    {3, 3, 9, 1, 1, 8, 8939},
                    {4, 4, 5, 1, 1, 8, 2353},
                    {5, 5, 12, 1, 2, 9, 5533},
                    {6, 6, 13, 1, 1, 8, 6401},
                    {7, 7, 10, 1, 1, 8, 9629},
                    {8, 8, 10, 1, 1, 8, 3681},
                    {9, 9, 12, 1, 2, 9, 4943},
                    {10, 10, 9, 1, 2, 9, 1588},
                    {11, 11, 18, 1, 1, 8, 2775},
                    {12, 12, 16, 1, 3, 10, 1824},
                    {13, 13, 14, 1, 3, 10, 1381},
                    {14, 14, 18, 1, 3, 10, 1320},
                    {15, 16, 13, 1, 3, 10, 2569},
                    {16, 17, 15, 1, 3, 10, 8236},
                    {17, 18, 17, 1, 3, 10, 4365},
                    {18, 19, 14, 1, 1, 8, 4703},
                    {19, 20, 21, 1, 1, 8, 10967},
                    {20, 21, 16, 1, 2, 9, 6872},
                    {21, 22, 17, 1, 1, 8, 4809},
                    {22, 23, 21, 1, 1, 8, 2483}};

    public static int findStartNode(int[][] data){

        for (int i=0; i<data.length; i++){
            if ((data[i][0]) != data[i][1])
                return data[i][0];
        }

        return -1;
    }
    
    public static void main(String[] args){

        BST<Integer> tree = new BST<>();

        int startnode = findStartNode(testdata);
        if (startnode != -1)
            System.out.println(startnode);
        else   
            System.out.println("Cannot find the start node!");

        tree.
    }

}