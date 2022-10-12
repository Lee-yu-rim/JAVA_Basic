import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		//배열 : 동일한 타입의 변수를 여러개 정의 하는 것 
		
//		int a,b,c,d,e;
//		a=10;
//		b=20;
//		c=30;
//		d=40;
//		e=50;
//		
//		System.out.println(a+b);
		
//		int[] arr;   //배열의 선언
		//배열의 데이터 타입은 int[]까지가 타입임!
//		arr = new int[5];  //배열의 생성

		
//		int[] arr = new int[5];

//		int[] arr = {10,20,30,40,50};  // -> 배열의 선언 + 생성 + 초기화를 한꺼번에 진행
		
//		arr[0] = 10;  //인덱스 번호는 항상 하나보다 작은 수를 적어야한다 : 0부터 시작하므로 
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
//		int[] arr2;  // 배열변수는 주소값(위치값)이다. -> 데이터가 저장되어있는 위치를 가져온다.
//		
//		arr2 = arr1;
//		
//		System.out.println(arr1[0]);
//		System.out.println(arr2[0]);
//		
//		arr2[3] = 10;
//		
//		System.out.println(arr1[3]);   //= 10
//		System.out.println(arr2[3]);   //= 10  둘의 값은 같다
		
		
		//배열의 활용
		//순차처리 -> 0부터 시작해서 순서대로 가져오고 읽고 씀
		//반복문
		
//		int[] arr = new int[10];  
//		
//		//쓰기작업
//		for(int i=0;i<arr.length;i++) { 
//			arr[i] = 1;
//		}
//		//읽기작업
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
//		System.out.println("홀수: " + odd);
//		System.out.println("짝수: " + even);
		
		
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
		
		
		//향상된 for문
//		for(변수 : 배열변수명) {
//			실행문
//		}
		
//		int[] arr =  {1,2,3,4,5};
//		
//		for(int i : arr) {  //첫번쨰 위치부터 순차적으로 값을 읽어온다는 의미
//			System.out.println(i);   // = 1 2 3 4 5
//		}
//		
//		
//		int sum = 0;
//		for(int i : arr) { 
//			sum += i;
//		}
//		System.out.println(sum);
		
		
//		String[] str = {"사과","딸기","포도"};
//		
//		for(String s : str) {
//			System.out.println(s);
//		}
		
		//난수 1 ~ 100 사이값 중에 10개를 배열 값으로 초기화 한다.
        //배열의 값을 출력한다.
		
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
		
		// 난수를 사용하여  0 ~ 9 값으로 초기화 한다. 
		// 실행결과
        // 0 - 2개   1 - 0개   3 - 1개...9 - 3개
		
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
//		//int n0=0,n1=0,n2=0,n3=0,n4=0,n5=0,n6=0,n7=0,n8=0,n9=0; //같은 타입에 동일한 문자 ==> 배열 이용
//		
//		int[] cntArr = new int[10];   //기본값으로 자동초기화 된다.
//		
//		for(int i=0;i<arr.length;i++) {
////			for(int j=0;j<arr.length;j++) {
////				if(arr[i] == j) {
////					cntArr[j]++;
//			cntArr[arr[i]]++;   
//			}
//		
//			// ex) arr -> 2321745296 일때
////			arr[0] -> arr 배열의 0번째 수를 가져와라 = 2
////			cntArr[arr[0]]++ -> cntArr[2] -> cntArr의 2번째 배열에 +1을 추가시켜라 
////			=>     1
////			   0 1 2 3 4 5 6 7 8 9
////			arr[1] -> arr 배열의 1번째 수를 가져와라 = 3
////			cntArr[arr[1]]++ -> cntArr[3] 
////			=>     1 1 
////			   0 1 2 3 4 5 6 7 8 9
////			이런식으로 arr이 1개씩 올라갈 수록 순차적으로 안에 들어있는 난수의 숫자에 따라 cntArr의 배열안에 그 숫자의 갯수가 추가된다.
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
//		System.out.println(score[i] + "점은 " + rank[i] + "등 입니다.");
//		}
		
		//실행결과
//		60점은 7등 입니다.
//		70점은 6등 입니다.
//		80점은 4등 입니다.
//		90점은 2등 입니다.
//		75점은 5등입니다.
//		85점은 3등 입니다.
//		95점은 1등입니다.
//		50점은 8등 입니다.
//		45점은 9등 입니다.
//		30점은 10등 입니다.
		
		//정렬 : 오름차순, 내림차순
//		int[] arr = {2,4,1,5,3};
//		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {   //i와 비교할 것이므로  i보다 +1큰수부터 시작해준다.
//				if(arr[i] > arr[j]) {    //i의 값이 배열의 다음값인 j보다 작으면 tmp를 이용하여 값을 바꿔준다. -> 제일 작은 수가 맨 앞에 오게 됨.
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
		
		
		
		
		//무작위로 정렬
//		for(int i=0;i<arr.length*5;i++) {  //25번의 횟수만큼 수가 섞인다.
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
		
		
		
//		String[] name = {"홍길동","손흥민","김연아"};
//		int[] medal = {3,2,10};
//		
////		실행결과
////		
////		김연아 메달10개 1등
////		홍길동 메달3개 2등
////		손흥민 메달2개 3등
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
//			System.out.println(name[i] + " 메달" + medal[i] + "개 " + (i+1) + "등");
//		} //내림차순으로 정렬 후 등수를 메긴다.
		
		
		//배열 - 1차원
		//   - 다차원(2차원) - 정방형(열의 크기가 동일), 비정방형(열의 크기가 다름-사용x)
		
//		int[][] score;//행  열
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
		
		
//		for(int i=0;i<5;i++) {   //행
//			for(int j=0;j<3;j++) {  //열
//				System.out.print(score[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		//하나의 인덱스 번호를 입력한 경우  -> 위치(주소값)만 찾을 수 있음 
		//ex) arr[0] -> 첫번째 행의 첫번째 위치를 의미함
		//ex) arr[1] -> 두번째 행의 첫번째 위치를 의미함
		//ex) arr[2] -> 세번째 행의 첫번째 위치를 의미함
		
		//arr[1][2]  -> 실제 값을 가져오는 경우

		
//		int[][] score = {
//				{1,2,3},
//				{4,5,6},
//				{7,8,9},
//				{10,11,12},
//				{13,14,15}	
//		};
//				
//		
//		for(int i=0;i<score.length;i++) {   //행
//			for(int j=0;j<score[i].length;j++) {  //열
//				System.out.print(score[i][j] + " ");
//				}
//			System.out.println();
//		}
//		
//		System.out.println("=============");
//		
//		for(int[] i : score) {   // -> score 배열의 각 행의 첫번째 주소값들을 가져온다
//			for(int j : i) {     //i에 있는 j의 값을 가져온다.
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
//					star[i][j] = '*';    // 행의 값이 열의 값보다 크거나 같으면 * 를 넣겠다.
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
//				if(i + j <= 4) {   //비교 연산으로 조건문을 작성하지 못할때는 산술 연산자를 이용하려고 생각해보자.(규칙을 찾아보기)
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
//		System.out.println("행의 크기를 입력하세요 : ");
//		
//		int row = sc.nextInt();
//		int col = row * 2 - 1;
//		
//		char[][] star = new char[row][col];
//		
//		for(int i=0;i<star.length;i++) {          //반복 횟수를 별이 들어가는 갯수만큼으로 설정
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
//		System.out.println("번호 국어  영어  수학  총점  평균");
//		
//		int sum;
//		int korTot = 0;
//		int engTot = 0;
//		int mathTot = 0;    //합계를  for문 바깥쪽에서 출력하기 위해 변수 선언도 for문 밖에서 해준다.
//		
//		for(int i=0;i<score.length;i++) {
//			korTot += score[i][0];    //열의 번호를 숫자로 고정하고 행의 값을 변수로 둬서 국어, 영어, 수학 열의 행의 값들을 더할 수 있게 한다.	
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
//		System.out.println("합계" + " " + korTot + " " + engTot + " " + mathTot + " " + totScore);
		
		
		//score.length -> 행의 크기
		//score[0].length -> 첫번째 행의 열의 크기
		
		
		
//		//빙고 게임 만들기
//		int[][] bingo = new int[5][5];
//		
//		//배열에 1 ~ 50 난수를 초기화 한다.
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
//			System.out.println("숫자를 입력하세요: ");
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
//				System.out.println("게임 종료");	
//				break;
//				}
//			}

		
	
		//강사님 풀이
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
//			System.out.println("숫자 입력: ");
//			num = sc.nextInt();
//			
//			sum = 0;  //sum의 값을 0으로 초기화하지 않으면 숫자를 입력할 때마다 빙고판에 있는 합계가 누적됨.
//			
//			for(int i=0;i<bingo.length;i++) {
//				for(int j=0;j<bingo[i].length;j++) {
//					if(bingo[i][j] == num) {
//						bingo[i][j] = 0;
//						}sum += bingo[i][j];  // -> 빙고판에 있는 모든 값을 더하는 것, 같은 값을 입력해서 0이 되면 sum의 합계가 줄어들게 된다.
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
