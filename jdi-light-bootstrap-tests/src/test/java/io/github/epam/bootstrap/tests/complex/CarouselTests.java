package io.github.epam.bootstrap.tests.complex;

import static io.github.com.StaticSite.bsPage;
import static io.github.com.pages.BootstrapPage.*;
import static io.github.com.pages.BootstrapPage.carouselSlidesOnly;
import static io.github.epam.states.States.shouldBeLoggedIn;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

import io.github.epam.TestsInit;

public class CarouselTests extends TestsInit {
	
	@BeforeMethod
	public void before() {
		shouldBeLoggedIn();
		bsPage.shouldBeOpened();
	}

	private String firstSlideText = "First slide";
	private String secondSlideText = "Second slide";
	private String thirdSlideText = "Third slide";
	
	private String nextText = "Next";
	private String prevText = "Previous";
	
	private String firstSlideWithLabelText = "First slide\n" +
	                                 "FIRST SLIDE LABEL\n" +
			                         "Nulla vitae elit libero, a pharetra augue mollis interdum.";
	private String secondSlideWithLabelText = "Second slide\n" + 
			                          "SECOND SLIDE LABEL\n" + 
			                          "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
	private String thirdSlideWithLabelText = "Third slide\n" + 
			                          "THIRD SLIDE LABEL\n" + 
			                          "Praesent commodo cursus magna, vel scelerisque nisl consectetur.";

	//Carousel slides only tests
	@Test
	public void getSlidesTextTest() {
		assertEquals(carouselSlidesOnly.getText(), firstSlideText);
		
		//carouselSlidesOnly.base().waitSec(10);
		delay(10000);
		assertEquals(carouselSlidesOnly.getText(), secondSlideText);
	}
	
	//Carousel with controls tests
	@Test
	public void prevTest() {
		carouselControls.prev();	
		//carouselControls.base().waitSec(1);
		delay(1000);
		assertEquals(carouselControls.getText(), secondSlideText);
		
		carouselControls.prev();	
		//carouselControls.base().waitSec(1);
		delay(1000);
		assertEquals(carouselControls.getText(), firstSlideText);
		
		assertEquals(carouselControls.prevControl().getText(), prevText);
	}
	
	@Test
	public void nextTest() {
		carouselControls.next();	
		//carouselControls.base().waitSec(1);
		delay(1000);
		assertEquals(carouselControls.getText(), firstSlideText);
		
		carouselControls.next();	
		//carouselControls.base().waitSec(1);
		delay(1000);
		assertEquals(carouselControls.getText(), secondSlideText);
		
		assertEquals(carouselControls.nextControl().getText(), nextText);
	}
	
	//Carousel with indicators tests
	@Test
	public void selectTest() {
		carouselIndicators.select(1);	
		//carouselIndicators.base().waitSec(1);
		delay(1000);
		assertEquals(carouselIndicators.getText(), firstSlideText);
		assertTrue(carouselIndicators.list().get(0).isSelected());
		assertFalse(carouselIndicators.list().get(1).isSelected());
		
		carouselIndicators.select(3);	
		//carouselIndicators.base().waitSec(1);
		delay(1000);
		assertEquals(carouselIndicators.getText(), thirdSlideText);
		assertTrue(carouselIndicators.list().get(2).isSelected());
		assertFalse(carouselIndicators.list().get(0).isSelected());
		
		carouselIndicators.select(2);	
		//carouselIndicators.base().waitSec(1);
		delay(1000);
		assertEquals(carouselIndicators.getText(), secondSlideText);
		assertTrue(carouselIndicators.list().get(1).isSelected());
		assertFalse(carouselIndicators.list().get(2).isSelected());
    }
	
	@Test(enabled = false)
	public void selected() {
		carouselIndicators.select(1);	
		//carouselIndicators.base().waitSec(1);
		delay(1000);
		System.out.println(carouselIndicators.selected());
		
		carouselIndicators.select(2);	
		//carouselIndicators.base().waitSec(1);
		delay(1000);
		System.out.println(carouselIndicators.selected());
		
		carouselIndicators.select(3);	
		//carouselIndicators.base().waitSec(1);
		delay(1000);
		System.out.println(carouselIndicators.selected());
	}
	
	//Carousel with captions tests
	@Test
	public void captionTest() {
		carouselCaptions.select(1);
		//carouselCaptions.base().waitSec(1);
		delay(1000);
		assertEquals(carouselCaptions.getText(), firstSlideWithLabelText);
		
		carouselCaptions.select(2);
		//carouselCaptions.base().waitSec(1);
		delay(1000);
		assertEquals(carouselCaptions.getText(), secondSlideWithLabelText);

		carouselCaptions.select(3);
		//carouselCaptions.base().waitSec(1);
		delay(1000);
		assertEquals(carouselCaptions.getText(), thirdSlideWithLabelText);

	}
	
	// Carousel fade tests
	@Test
	public void fadeSelectTest() {
		carouselFade.select(1);	
		//carouselFade.base().waitSec(1);
		delay(1000);
		assertEquals(carouselFade.getText(), firstSlideText);
		assertTrue(carouselFade.list().get(0).isSelected());
		assertFalse(carouselFade.list().get(1).isSelected());
		
		carouselFade.select(3);	
		//carouselFade.base().waitSec(1);
		delay(1000);
		assertEquals(carouselFade.getText(), thirdSlideText);
		assertTrue(carouselFade.list().get(2).isSelected());
		assertFalse(carouselFade.list().get(0).isSelected());
	}
	
	@Test
	public void fadePrevTest() {
		carouselFade.prev();	
		//carouselFade.base().waitSec(1);
		delay(1000);
		assertEquals(carouselFade.getText(), thirdSlideText);
		
		carouselFade.prev();	
		//carouselFade.base().waitSec(1);
		delay(1000);
		assertEquals(carouselFade.getText(), secondSlideText);
		
		assertEquals(carouselFade.prevControl().getText(), prevText);
	}
	
	@Test
	public void fadeNextTest() {
		carouselFade.next();	
		//carouselFade.base().waitSec(1);
		delay(1000);
		assertEquals(carouselFade.getText(), secondSlideText);
		
		carouselFade.next();	
		//carouselFade.base().waitSec(1);
		delay(1000);
		assertEquals(carouselFade.getText(), thirdSlideText);
		
		assertEquals(carouselFade.nextControl().getText(), nextText);
	}
	
	
	// Carousel with interval tests
	@Test
	public void intervalTest() {
		//carouselInterval.base().waitSec(1);
		delay(carouselInterval.interval());
		assertEquals(carouselInterval.getText(), firstSlideText);
		
		//carouselInterval.base().waitSec(1);
		delay(carouselInterval.interval());
		assertEquals(carouselInterval.getText(), secondSlideText);
		
		//carouselInterval.base().waitSec(1);
		delay(carouselInterval.interval());
		assertEquals(carouselInterval.getText(), thirdSlideText);
	}

	public void delay(long ms) {
		try {
			System.out.println("DELAY: " + ms);
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
