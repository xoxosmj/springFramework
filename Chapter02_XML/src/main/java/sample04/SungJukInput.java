package sample04;

import lombok.Setter;

import java.util.List;
import java.util.Scanner;

public class SungJukInput implements SungJuk {
    @Setter
    private SungJukDTO2 sungJukDTO2 = null;

    @Setter
    private List<SungJukDTO2> list;

 	/*
 	applicationContext.xml에서 처리했으므로 주석

	public void setSungJukDTO2(SungJukDTO2 sungJukDTO2) {
		this.sungJukDTO2 = sungJukDTO2;
	}
	*/

    @Override
    public void execute() {
        System.out.println();
        Scanner scan = new Scanner(System.in);

        System.out.print("이름 입력: ");
        String name = scan.next();
        System.out.println("국어 입력: ");
        int kor = scan.nextInt();
        System.out.println("영어 입력: ");
        int eng = scan.nextInt();
        System.out.println("수학 입력: ");
        int math = scan.nextInt();

        int tot = kor + eng + math;
        double avg = tot / 3.0;

        sungJukDTO2.setName(name);
        sungJukDTO2.setKor(kor);
        sungJukDTO2.setEng(eng);
        sungJukDTO2.setMath(math);
        sungJukDTO2.setTot(tot);
        sungJukDTO2.setAvg(avg);

        list.add(sungJukDTO2);

        System.out.println(name+"님의 데이터를 입력 하였습니다");

    }

}
