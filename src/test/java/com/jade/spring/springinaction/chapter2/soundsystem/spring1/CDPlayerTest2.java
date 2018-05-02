package com.jade.spring.springinaction.chapter2.soundsystem.spring1;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jade.spring.springinaction.chapter2.soundsystem.spring1.CompactDisc;

/**
 * 通过XML启动组件扫描
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath*:/cdplayer.xml")
public class CDPlayerTest2 {

	@Autowired
	private CompactDisc cd;
	
	@Test
	public void testCdShouldNotBeNull() {
		assertNotNull(cd);
	}
}
