package conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sample01.MessageBeanImpl;
import sample02.CalcAdd;
import sample02.CalcMul;

@Configuration
public class SpringConfiguration {
	
//	@Bean
//	public MessageBeanImpl messageBeanImpl(){
//		return new MessageBeanImpl("사과");
//	}
	
	@Bean(name="messageBeanImpl")
	public MessageBeanImpl getMessageBeanImpl(){
		return new MessageBeanImpl("사과");
	}
	
	@Bean
    public CalcAdd calcAdd() {
        return new CalcAdd(25, 36);
    }

    @Bean(name="calcMul")
    public CalcMul getCalcMul() {
        return new CalcMul();
    }

}

/*
@Bean
- 메서드에서 return 되는 값을 스프링의 bean으로 생성한다.
- 메서드명은 반드시 bean의 id명으로 해야한다.
- 메서드명을 자바처럼 getter로 사용하려면 @Bean(name="") 를 사용해야한다.
 */








