import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		//�迭 : ������ Ÿ���� ������ ������ ���� �ϴ� �� 
		
//		int a,b,c,d,e;
//		a=10;
//		b=20;
//		c=30;
//		d=40;
//		e=50;
//		
//		System.out.println(a+b);
		
//		int[] arr;   //�迭�� ����
		//�迭�� ������ Ÿ���� int[]������ Ÿ����!
//		arr = new int[5];  //�迭�� ����

		
//		int[] arr = new int[5];

//		int[] arr = {10,20,30,40,50};  // -> �迭�� ���� + ���� + �ʱ�ȭ�� �Ѳ����� ����
		
//		arr[0] = 10;  //�ε��� ��ȣ�� �׻� �ϳ����� ���� ���� ������Ѵ� : 0���� �����ϹǷ� 
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		
		
//		char[] cArr = new char[4];
		
//		char[] cArr = {'G','o','o','d'};
		
//		cArr[0] = 'G';
//		cArr[1] = 'o';
//		cArr[2] = 'o';
//		cArr[3] = 'd';
		
//		System.out.print(cArr[0]);
//		System.out.print(cArr[1]);
//		System.out.print(cArr[2]);
//		System.out.print(cArr[3]);
		
//		String[] strArr = {"java","jsp","DB"};
		
//		System.out.println(strArr[0]);
//		strArr[2] = "html";
//		System.out.println(strArr[2]);
		
		
//		int x = 1;
//		int y;
//		
//		y = x;
		
//		int[] arr1 = {1,2,3,4,5};
//		int[] arr2;  // �迭������ �ּҰ�(��ġ��)�̴�. -> �����Ͱ� ����Ǿ��ִ� ��ġ�� �����´�.
//		
//		arr2 = arr1;
//		
//		System.out.println(arr1[0]);
//		System.out.println(arr2[0]);
//		
//		arr2[3] = 10;
//		
//		System.out.println(arr1[3]);   //= 10
//		System.out.println(arr2[3]);   //= 10  ���� ���� ����
		
		
		//�迭�� Ȱ��
		//����ó�� -> 0���� �����ؼ� ������� �������� �а� ��
		//�ݺ���
		
//		int[] arr = new int[10];  
//		
//		//�����۾�
//		for(int i=0;i<arr.length;i++) { 
//			arr[i] = 1;
//		}
//		//�б��۾�
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
//		int[] arr = new int[10];
//		
//		for(int i=0;i<arr.length;i++) {    //i = 0,1,2,3,4,5,6,7,8,9
//			arr[i] = i + 1;
//		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]); 
//		}
//		
//		int sum = 0;
//		
//		for(int i=0;i<arr.length;i++) {
//			sum += arr[i];
//		}
//		System.out.println(sum);
//		
//		
//		int odd = 0;
//		int even = 0;
//		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i] % 2 == 1) {
//				odd += arr[i];
//			}else {
//				even += arr[i];
//			}
//		}
//		
//		System.out.println("Ȧ��: " + odd);
//		System.out.println("¦��: " + even);
		
		
//		int[] arr = new int[10];
//		
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = i + 1;
//		}
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		
//		int sum1 = 0;
//		int sum2 = 0;
//		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i] % 2 == 1) {
//				sum1 += arr[i];
//			}else {
//				sum2 += arr[i];
//			}
//		}
//		System.out.println(sum1);
//		System.out.println(sum2);
		
		
		//���� for��
//		for(���� : �迭������) {
//			���๮
//		}
		
//		int[] arr =  {1,2,3,4,5};
//		
//		for(int i : arr) {  //ù���� ��ġ���� ���������� ���� �о�´ٴ� �ǹ�
//			System.out.println(i);   // = 1 2 3 4 5
//		}
//		
//		
//		int sum = 0;
//		for(int i : arr) { 
//			sum += i;
//		}
//		System.out.println(sum);
		
		
//		String[] str = {"���","����","����"};
//		
//		for(String s : str) {
//			System.out.println(s);
//		}
		
		//���� 1 ~ 100 ���̰� �߿� 10���� �迭 ������ �ʱ�ȭ �Ѵ�.
        //�迭�� ���� ����Ѵ�.
		
//		int[] arr = new int[10]; 
		
//		for(int i=0;i<arr.length;i++) {
//			int ran =(int)(Math.random() * 100) + 1;
//			arr[i] = ran;
//		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		
//		System.out.println("===============");
//		
//		int max = arr[0];
//		int min = arr[0];
//		
//		for(int i=0;i<arr.length;i++) { 
//			if(max < arr[i]) { 
//				max = arr[i];
//				}
//				if(min > arr[i]) {
//					min = arr[i];
//				}
//		}
//		System.out.println("max = " + max);
//		System.out.println("min = " + min);
		
		// ������ ����Ͽ�  0 ~ 9 ������ �ʱ�ȭ �Ѵ�. 
		// ������
        // 0 - 2��   1 - 0��   3 - 1��...9 - 3��
		
//		int[] arr = new int[10];
//		
//		for(int i=0;i<arr.length;i++) {
//			int ran = (int)(Math.random()*10);
//			arr[i] = ran;
//		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i] + ",");
//		}
//		
//		//int n0=0,n1=0,n2=0,n3=0,n4=0,n5=0,n6=0,n7=0,n8=0,n9=0; //���� Ÿ�Կ� ������ ���� ==> �迭 �̿�
//		
//		int[] cntArr = new int[10];   //�⺻������ �ڵ��ʱ�ȭ �ȴ�.
//		
//		for(int i=0;i<arr.length;i++) {
////			for(int j=0;j<arr.length;j++) {
////				if(arr[i] == j) {
////					cntArr[j]++;
//			cntArr[arr[i]]++;   
//			}
//		
//			// ex) arr -> 2321745296 �϶�
////			arr[0] -> arr �迭�� 0��° ���� �����Ͷ� = 2
////			cntArr[arr[0]]++ -> cntArr[2] -> cntArr�� 2��° �迭�� +1�� �߰����Ѷ� 
////			=>     1
////			   0 1 2 3 4 5 6 7 8 9
////			arr[1] -> arr �迭�� 1��° ���� �����Ͷ� = 3
////			cntArr[arr[1]]++ -> cntArr[3] 
////			=>     1 1 
////			   0 1 2 3 4 5 6 7 8 9
////			�̷������� arr�� 1���� �ö� ���� ���������� �ȿ� ����ִ� ������ ���ڿ� ���� cntArr�� �迭�ȿ� �� ������ ������ �߰��ȴ�.
//			
//
////			if(arr[i] == 0) {
////				n0++;
////			}else if(arr[i] == 1) {
////				n1++;
////			}else if(arr[i] == 2) {
////				n2++;
////			}else if(arr[i] == 3) {
////				n3++;
////			}else if(arr[i] == 4) {
////				n4++;
////			}else if(arr[i] == 5) {
////				n5++;
////			}else if(arr[i] == 6) {
////				n6++;
////			}else if(arr[i] == 7) {
////				n7++;
////			}else if(arr[i] == 8) {
////				n8++;
////			}else if(arr[i] == 9) {
////				n9++;
////			}
////		}
//		
//		System.out.println();
//		
////		System.out.println(0 + " = " + n0);
////		System.out.println(1 + " = " + n1);
////		System.out.println(2 + " = " + n2);
////		System.out.println(3 + " = " + n3);
////		System.out.println(4 + " = " + n4);
//		
//		for(int i=0;i<cntArr.length;i++) {
//			System.out.println(i + " - " + cntArr[i]);
//		}
		
//		int[] score = {60,70,80,90,75,85,95,50,45,30};
//		int[] rank = {1,1,1,1,1,1,1,1,1,1};
//		
////		score[0] <  score[0]      rank[0] -> 1
////		score[0] <  score[1]      rank[0] -> 2
////		score[0] <  score[2]      rank[0] -> 3
////		score[0] <  score[3]      rank[0] -> 4
////		score[0] <  score[4]      rank[0] -> 5
////		score[0] <  score[5]      rank[0] -> 6
////		score[0] <  score[6]      rank[0] -> 7
////		score[0] <  score[7]      rank[0] -> 7
////		score[0] <  score[8]      rank[0] -> 7
////		score[0] <  score[9]      rank[0] -> 7		
//		
//		for(int i=0;i<score.length;i++) {
//			for(int j=0;j<score.length;j++) {
//				if(score[i] < score[j]) { 
//					rank[i]++;					
//				}
//			}
//		}
//		
//		for(int i=0;i<score.length;i++) {
//		System.out.println(score[i] + "���� " + rank[i] + "�� �Դϴ�.");
//		}
		
		//������
//		60���� 7�� �Դϴ�.
//		70���� 6�� �Դϴ�.
//		80���� 4�� �Դϴ�.
//		90���� 2�� �Դϴ�.
//		75���� 5���Դϴ�.
//		85���� 3�� �Դϴ�.
//		95���� 1���Դϴ�.
//		50���� 8�� �Դϴ�.
//		45���� 9�� �Դϴ�.
//		30���� 10�� �Դϴ�.
		
		//���� : ��������, ��������
//		int[] arr = {2,4,1,5,3};
//		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {   //i�� ���� ���̹Ƿ�  i���� +1ū������ �������ش�.
//				if(arr[i] > arr[j]) {    //i�� ���� �迭�� �������� j���� ������ tmp�� �̿��Ͽ� ���� �ٲ��ش�. -> ���� ���� ���� �� �տ� ���� ��.
//					int tmp;
//					tmp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = tmp;			
//				}
//			}
//		}
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i] + ", ");
//		}
		
		
		
		
		//�������� ����
//		for(int i=0;i<arr.length*5;i++) {  //25���� Ƚ����ŭ ���� ���δ�.
//			int x = (int)(Math.random() * 5);
//			int y = (int)(Math.random() * 5);
//			
//			int tmp;
//			tmp = arr[x];
//			arr[x] = arr[y];
//			arr[y] = tmp;
//		}
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i] + ", ");
//		}
		
//		
//		int tmp;
//		
//		tmp = arr[1];
//		arr[1] = arr[3];
//		arr[3] = tmp;
		
//		int x = 10;
//		int y = 20;
//		int tmp = 0;
//		
//		tmp = x;
//		x = y;
//		y = tmp;  // = x=20, y=10   
		
		
		
//		String[] name = {"ȫ�浿","�����","�迬��"};
//		int[] medal = {3,2,10};
//		
////		������
////		
////		�迬�� �޴�10�� 1��
////		ȫ�浿 �޴�3�� 2��
////		����� �޴�2�� 3��
//		
//		for(int i=0;i<medal.length;i++) {
//			for(int j=i+1;j<medal.length;j++) {
//				if(medal[i] < medal [j]) {
//					int tmp;
//					tmp = medal[i];
//					medal[i] = medal[j];
//					medal[j] = tmp;
//					
//					String nTmp;
//					nTmp = name[i];
//					name[i] = name[j];
//					name[j] = nTmp;
//				}
//			}
//		}
//		
//		for(int i=0;i<medal.length;i++) {
//			System.out.println(name[i] + " �޴�" + medal[i] + "�� " + (i+1) + "��");
//		} //������������ ���� �� ����� �ޱ��.
		
		
		//�迭 - 1����
		//   - ������(2����) - ������(���� ũ�Ⱑ ����), ��������(���� ũ�Ⱑ �ٸ�-���x)
		
//		int[][] score;//��  ��
// 		score = new int[5][3]; 
		
//		int[][] score = new int[5][3]; 
		
//		int[][] score = {
//				{1,2,3},
//				{4,5,6},
//				{7,8,9},
//				{10,11,12},
//				{13,14,15}
//		};
//		
// 		score[0][0] = 1;
// 		score[0][1] = 2;
// 		score[0][2] = 3;
// 		
// 		score[1][0] = 4;
// 		score[1][1] = 5;
// 		score[1][2] = 6;
// 		.
//		.
//		.
// 		score[4][2] = 15;
// 		
// 		System.out.println(score[0][0]);
// 		System.out.println(score[0][1]);
// 		System.out.println(score[0][2]);
// 		System.out.println(score[4][2]);
		
		
//		for(int i=0;i<5;i++) {   //��
//			for(int j=0;j<3;j++) {  //��
//				System.out.print(score[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		//�ϳ��� �ε��� ��ȣ�� �Է��� ���  -> ��ġ(�ּҰ�)�� ã�� �� ���� 
		//ex) arr[0] -> ù��° ���� ù��° ��ġ�� �ǹ���
		//ex) arr[1] -> �ι�° ���� ù��° ��ġ�� �ǹ���
		//ex) arr[2] -> ����° ���� ù��° ��ġ�� �ǹ���
		
		//arr[1][2]  -> ���� ���� �������� ���

		
//		int[][] score = {
//				{1,2,3},
//				{4,5,6},
//				{7,8,9},
//				{10,11,12},
//				{13,14,15}	
//		};
//				
//		
//		for(int i=0;i<score.length;i++) {   //��
//			for(int j=0;j<score[i].length;j++) {  //��
//				System.out.print(score[i][j] + " ");
//				}
//			System.out.println();
//		}
//		
//		System.out.println("=============");
//		
//		for(int[] i : score) {   // -> score �迭�� �� ���� ù��° �ּҰ����� �����´�
//			for(int j : i) {     //i�� �ִ� j�� ���� �����´�.
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
		
		
//		int[][] arr = new int[2][5];
//		int num = 1;
//		
//		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				arr[i][j] = num++;  // = (i*5) + j + 1
//			}
//		}
//		
//		for(int[] i : arr) {
//			for(int j : i) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
		
//		int[][] arr = new int[5][3];
//		int num = 1;
//		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				arr[i][j] = num++;  // = (i * 3) + j + 1
//			}
//		}
//		
//		for(int[] i : arr) {
//			for(int j : i) {
//				System.out.print(j + " ");
//				}
//			System.out.println();
//		}
		
		
//		*           0.0
//		**          1.0 1.1
//		***         2.0 2.1 2.2
//		****        3.0 3.1 3.2 3.3
//		*****       4.0 4.1 4.2 4.3 4.4   
		
//		char[][] star = new char[5][5];
//		
//		for(int i=0;i<star.length;i++) {
//			for(int j=0;j<star[i].length;j++) {
//				if(i >= j) {
//					star[i][j] = '*';    // ���� ���� ���� ������ ũ�ų� ������ * �� �ְڴ�.
//				}
//			}
//		}
//		
//		for(char[] i : star) {
//			for(char j : i) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
		
	
//		*****     0.0 0.1 0.2 0.3 0.4 
//		****      1.0 1.1 1.2 1.3 
//		***       2.0 2.1 2.2 
//		**        3.0 3.1 
//		*         4.0
		
//		char[][] star = new char[5][5];
//		
//		for(int i=0;i<star.length;i++) {
//			for(int j=0;j<star[i].length;j++) {
//				if(i + j <= 4) {   //�� �������� ���ǹ��� �ۼ����� ���Ҷ��� ��� �����ڸ� �̿��Ϸ��� �����غ���.(��Ģ�� ã�ƺ���)
//					star[i][j] = '*';
//				}
//			}
//		}
//		
//		for(char[] i : star) {
//			for(char j : i) {
//				System.out.print(j + " ");
//				}
//			System.out.println();
//		}
		
		
//		    *                     0.4
//		   **                 1.3 1.4
//		  ***             2.2 2.3 2.4
//		 ****         3.1 3.2 3.3 3.4
//		*****     4.0 4.1 4.2 4.3 4.4
		
//		char[][] star = new char[5][5];
//		
//		for(int i=0;i<star.length;i++) {
//			for(int j=0;j<star[i].length;j++) {
//				if(i + j >= 4) {
//					star[i][j] = '*';
//				}
//			}
//		}
//		
//		for(char[] i : star) {
//			for(char j : i) {
//				System.out.print(j + " ");
//			}System.out.println();
//		}
		
		
//		     *                          0.4
//		    ***                     1.3 1.4 1.5 
//		   *****                2.2 2.3 2.4 2.5 2.6
//		  *******           3.1 3.2 3.3 3.4 3.5 3.6 3.7
//		 *********      4.0 4.1 4.2 4.3 4.4 4.5 4.6 4.7 4.8
		
		
		
//		char[][] star = new char[5][9];
//		
//		for(int i=0;i<star.length;i++) {
//			for(int j=0;j<star[i].length;j++){
//				if(i+j >= 4 && j-i <= 4) {
//					star[i][j] = '*';
//				}
//			}
//		}
//		
//		for(char[] i : star) {
//			for(char j : i) {
//				System.out.print(j + " ");
//			}System.out.println();
//		}
		
		// ===
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("���� ũ�⸦ �Է��ϼ��� : ");
//		
//		int row = sc.nextInt();
//		int col = row * 2 - 1;
//		
//		char[][] star = new char[row][col];
//		
//		for(int i=0;i<star.length;i++) {          //�ݺ� Ƚ���� ���� ���� ������ŭ���� ����
//			int starCnt = 2 * i + 1;   // 1 3 5 7 9
//			int starStart = star.length - (i+1);  // 4 3 2 1 0
//			for(int j=starStart;j<starStart + starCnt;j++){
//				star[i][j] = '*';
//				}
//			}
//		
//		for(char[] i : star) {
//			for(char j : i) {
//				System.out.print(j + " ");
//			}System.out.println();
//		}
		
		
//		char[][] star = {   //[4][5]
//				{'*','*',' ',' ',' ',},   //-->> //****
//				{'*','*',' ',' ',' ',},          //****
//				{'*','*','*','*','*',},          //**
//				{'*','*','*','*','*',},          //**
//		};                                       //**
//
//		
//		for(int i=0;i<star.length;i++) {
//			for(int j=0;j<star[i].length;j++) {
//				System.out.print(star[i][j]);
//			}
//			System.out.println();
//		}
		
		
//		char[][] result = new char[star[0].length][star.length];  //[5][4]
//		
//		for(int i=0;i<star.length;i++) {
//			for(int j=0;j<star[i].length;j++) {
//				int x = j;
//				int y = 3 - i;
//				
//				result[x][y] = star[i][j];
//			}
//		}
//		
//		System.out.println();
//		System.out.println();
//		
//		for(char[] i : result) {
//			for(char j : i) {
//				System.out.print(j);
//			}System.out.println();
//		}
		
//		int[][] score = {
//				{10,10,10},
//				{20,20,20},
//				{30,30,30},
//				{40,40,40},
//				{50,50,50}
//		};
//		
//		System.out.println("��ȣ ����  ����  ����  ����  ���");
//		
//		int sum;
//		int korTot = 0;
//		int engTot = 0;
//		int mathTot = 0;    //�հ踦  for�� �ٱ��ʿ��� ����ϱ� ���� ���� ���� for�� �ۿ��� ���ش�.
//		
//		for(int i=0;i<score.length;i++) {
//			korTot += score[i][0];    //���� ��ȣ�� ���ڷ� �����ϰ� ���� ���� ������ �ּ� ����, ����, ���� ���� ���� ������ ���� �� �ְ� �Ѵ�.	
//			engTot += score[i][1];	
//			mathTot += score[i][2];	
//			sum = 0; 
//			System.out.print(" " + (i + 1) + "  ");
//			for(int j=0;j<score[i].length;j++) {
//				sum += score[i][j];
//				System.out.print(score[i][j] + "  ");
//				}
//			System.out.print(sum);
//			double avg = sum / (double)score[i].length;
//			System.out.print("  " + avg);
//			System.out.println();
//		}
//		
//		int totScore = korTot + engTot + mathTot;		
//		System.out.println("�հ�" + " " + korTot + " " + engTot + " " + mathTot + " " + totScore);
		
		
		//score.length -> ���� ũ��
		//score[0].length -> ù��° ���� ���� ũ��
		
		
		
//		//���� ���� �����
//		int[][] bingo = new int[5][5];
//		
//		//�迭�� 1 ~ 50 ������ �ʱ�ȭ �Ѵ�.
//		for(int i=0;i<bingo.length;i++) {
//			for(int j=0;j<bingo[i].length;j++) {
//				bingo[i][j] = (int)(Math.random() * 50) + 1;
//			}
//		}
//		
//		for(int i=0;i<bingo.length;i++) {
//			for(int j=0;j<bingo[i].length;j++) {
//				System.out.print(bingo[i][j] + " ");
//			}System.out.println();
//		}
//		
//		Scanner sc = new Scanner(System.in);
//				
//		while(true) {
//			System.out.println("���ڸ� �Է��ϼ���: ");
//
//			int num = sc.nextInt();
//			int a=0;
//			int b=0;
//			int c=0;
//			int d=0;
//			int e=0;
//			for(int i=0;i<bingo.length;i++) {
//				for(int j=0;j<bingo[i].length;j++) {
//					if(bingo[i][j] == num) {
//						bingo[i][j] = 0;
//						}a += bingo[i][0];
//						b += bingo[i][1];
//						c += bingo[i][2];
//						d += bingo[i][3];
//						e += bingo[i][4];
//						System.out.print(bingo[i][j] + " ");
//					}System.out.println();	
//				}
//			
//			if(a+b+c+d+e == 0) {
//				System.out.println("���� ����");	
//				break;
//				}
//			}

		
	
		//����� Ǯ��
//		int[][] bingo = new int[5][5];
//		
//		for(int i=0;i<bingo.length;i++) {
//			for(int j=0;j<bingo[i].length;j++) {
//				bingo[i][j] = (int)(Math.random() * 50) + 1;
//			}
//		}
//		
//		for(int i=0;i<bingo.length;i++) {
//			for(int j=0;j<bingo[i].length;j++) {
//				System.out.print(bingo[i][j] + " ");
//			}System.out.println();
//		}
//		
//		Scanner sc = new Scanner(System.in);
//		boolean flag = true;
//		int num;
//		int sum = 0;
//		
//		while(flag) {
//			System.out.println("���� �Է�: ");
//			num = sc.nextInt();
//			
//			sum = 0;  //sum�� ���� 0���� �ʱ�ȭ���� ������ ���ڸ� �Է��� ������ �����ǿ� �ִ� �հ谡 ������.
//			
//			for(int i=0;i<bingo.length;i++) {
//				for(int j=0;j<bingo[i].length;j++) {
//					if(bingo[i][j] == num) {
//						bingo[i][j] = 0;
//						}sum += bingo[i][j];  // -> �����ǿ� �ִ� ��� ���� ���ϴ� ��, ���� ���� �Է��ؼ� 0�� �Ǹ� sum�� �հ谡 �پ��� �ȴ�.
//						System.out.print(bingo[i][j] + " ");
//					}System.out.println();
//				}
//			
//			System.out.println("sum = " + sum);
//			if(sum == 0) {
//				flag = false;
//				}		
//			}	
//		
//		System.out.println("Game Over");
		
		
		
		
		
		
		
		
	

	}

}
