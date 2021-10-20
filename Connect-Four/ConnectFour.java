import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConnectFour {
	
	public static void main(String[] args) {
		System.out.println(whoIsWinner(new ArrayList<String>(
				Arrays.asList("C_Yellow",
			            "E_Red",
			            "G_Yellow",
			            "B_Red",
			            "D_Yellow",
			            "B_Red",
			            "B_Yellow",
			            "G_Red",
			            "C_Yellow",
			            "C_Red",
			            "D_Yellow",
			            "F_Red",
			            "E_Yellow",
			            "A_Red",
			            "A_Yellow",
			            "G_Red",
			            "A_Yellow",
			            "F_Red",
			            "F_Yellow",
			            "D_Red",
			            "B_Yellow",
			            "E_Red",
			            "D_Yellow",
			            "A_Red",
			            "G_Yellow",
			            "D_Red",
			            "D_Yellow",
			            "C_Red"))));
	}
//	public static char[] columns = new String("ABCDEFG").toCharArray();
	public static final String columns = "ABCDEFG";
	
	public static String whoIsWinner(List<String> piecesPositionList) {
		
		byte[][] graph = new byte[6][7];//1 - yellow 2 - red
		
		byte[] index = new byte[7];
		//list to array:
		for(String s : piecesPositionList) {
			byte color;
			if(s.charAt(2) == 'Y') color = 1;
			else color = 2;
			
			byte column = (byte) columns.indexOf(s.charAt(0));
			
			graph[index[column]++][column] = color;
			
		}
		
		//print graph:
		print(graph);
		
		//check around element
		//element 1 D [3][3]
		//check by column
		//check 1 down
		byte column = 0;
		byte row = 3;
		byte element = graph[row][column];// 1 or 2
		byte inline = 0;//if 4 win
		
		//columns:
		for(column = 0, row = 3, element = graph[row][column]; column < 7; ++column, row = 3) {
			if(graph[row-1][column] != element) continue;
			
			inline = 2;
			for(--row; row >= 0; --row) 
				if(graph[row][column] == element) inline++;
			//same ;(
			if(inline > 3) 
				if(element == 1) return "column " + columns.charAt(column) + " Yellow";
				else return "column " + columns.charAt(column) + " Red";
			
			for(row = 4; row < 6; ++row) 
				if(graph[row][column] == element) inline++;
			//same ;(
			if(inline > 3) 
				if(element == 1) return "column " + columns.charAt(column) + " Yellow";
				else return "column " + columns.charAt(column) + " Red";
			
			System.out.println("\n\nColumns cycle:\n" + inline + " in " + columns.charAt(column));
		}
		
		
		
		
        // retrun "Red" or "Yellow" or "Draw"
        return "\nDraw";
    }
	
	public static void print(byte[][] graph) {
		for(byte i = 5; i >= 0; --i) {
			for(byte j = 0; j < 7; ++j)
				System.out.print(graph[i][j] + " ");
			System.out.println();
		}
		for(byte i = 0; i < 7; ++i) System.out.print(columns.charAt(i) + " ");
	}
}
