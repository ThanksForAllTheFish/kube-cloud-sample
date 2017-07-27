package org.t4atf.kubecloudsample;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KubeCloudSampleApplicationTests {

	@Autowired
	private KubeProperties kubeProperties;

	@Test
	public void contextLoads() {
		assertThat(kubeProperties.getSomeString()).isEqualTo("someValue");
	}

}
