import java.io.*;
import java.util.*;
public class Helpout {
		static class Point implements Comparable<Point>{
			long x;
			long y;
			@Override
			public int compareTo(Point o) {
				return (x<o.x?-1:(x==o.x?0:1));
			}
		}
		
		public static void main(String[] args) throws IOException {
			int N; long S,E;
			int arr[][];
			BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
			String line = bi.readLine();
			long temp[] = new long[3];
			int ind=0;
			for (String numStr: line.split("\\s"))
				temp[ind++] =Long.parseLong(numStr);
			N = (int)temp[0];
			S = temp[1];
			E = temp[2];
			long XY[][]=new long[N][2];
			
			for(int i=0;i<N;i++){
				ind=0;
				line = bi.readLine();
				for (String numStr: line.split("\\s")){
					XY[i][ind++] =Long.parseLong(numStr);
	 
				}
			}
			Point[] points = new Point[N];
			for(int i=0;i<N;i++){
				points[i] = new Point();
				points[i].x = XY[i][0]-XY[i][1];
				points[i].y = XY[i][0]+XY[i][1];
			}
			
			solve(points,S,E);
		}
			
	 
		
		public static void solve(Point[] points,long S,long E){
			Arrays.sort(points);
			long start = S;
			long end = E;
			if(start==end){
				System.out.println(0);return;}
			long dist=0;
			for(int i=0;i<points.length&&start<end&&points[i].x<end;i++){
				if(points[i].x>start){
					dist+=points[i].x-start;
				}
				
				if(points[i].y>start)
					start = points[i].y;
			}
			if(end-start>0)
				dist+=end-start;
			System.out.println(dist);
		}



}
