package sample04;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

@Component
public class SungJukDelete implements SungJuk {

	@Autowired
	@Qualifier("arrayList")
	private List<SungJukDTO2> list;

	@Override
	public void execute() {
		System.out.println();
		Scanner scan = new Scanner(System.in);

		System.out.println("삭제할 이름 입력: ");
		String name = scan.next();

		System.out.println();
		int sw = 0; //스위치 변수

		Iterator<SungJukDTO2> it = list.iterator(); // 삭제할때는 확장for문을 사용하지말고 iterator 사용할것

		while (it.hasNext()) { //항목이 존재하면 true 없으면 false

			//it가 가리키는 항목을 꺼내서 저장하고 it는 다음 항목으로 이동
			SungJukDTO2 sungJukDTO2 = it.next();

			if (sungJukDTO2.getName().equals(name)) {
				sw=1;
				it.remove(); // it.next()로 꺼내서 저장한 항목을 제거한다 ??? 
				System.out.println(name+"님의 데이터를 삭제");

				break;
			}
		}

		if (sw==0) {
			System.out.println("찾고자하는 이름이 없습니다");
		}

	}

}
