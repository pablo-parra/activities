package pab.par.dom.activities;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pab.par.dom.activities.logic.api.Activitymanagement;
import pab.par.dom.activities.logic.dto.Activity;
import pab.par.dom.activities.logic.dto.SearchCriteria;

import static org.assertj.core.api.Assertions.*;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ActivitiesApplicationTests {

	final String MADRID = "madrid";
	final String NATURE = "nature";
	final String CULTURAL = "cultural";
	final String OUTDOORS = "outdoors";
	final String LATINA = "Latina";

	@Autowired
	private Activitymanagement activitymanagement;

	@Test
	public void getActivitiesNoFilterTest() throws IOException {

		List<Activity> activityList = this.activitymanagement.getActivities(new SearchCriteria(MADRID, null, "", null));

		assertThat(activityList.size()).isEqualTo(10);
	}

	@Test
	public void getActivitiesWithSomeFilterTest() throws IOException {

		List<Activity> activityList = this.activitymanagement.getActivities(new SearchCriteria(MADRID, CULTURAL, OUTDOORS, null));

		assertThat(activityList.size()).isEqualTo(2);
	}

	@Test
	public void getActivitiesWithAllFiltersTest() throws IOException {

		List<Activity> activityList = this.activitymanagement.getActivities(new SearchCriteria(MADRID, NATURE, OUTDOORS, LATINA));

		assertThat(activityList.size()).isEqualTo(1);

		Activity activity = activityList.get(0);
		assertThat(activity.getCategory()).isEqualTo(NATURE);
		assertThat(activity.getLocation()).isEqualTo(OUTDOORS);
		assertThat(activity.getDistrict()).isEqualTo(LATINA);
	}

	@Test
	public void getBestActivityTest() throws Exception{

		LocalDateTime startVisit = LocalDateTime.of(2018, 9, 03, 20, 0);
		LocalDateTime endVisit = LocalDateTime.of(2018, 9, 03, 21, 0);

		Activity bestActivity = this.activitymanagement.findBest(new SearchCriteria(MADRID, CULTURAL, null, null),startVisit, endVisit);

		assertThat(bestActivity).isNotNull();
		assertThat(bestActivity.getName()).isEqualTo("Teatros del Canal");
	}

}
