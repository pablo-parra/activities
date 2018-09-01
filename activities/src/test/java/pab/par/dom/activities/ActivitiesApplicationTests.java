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
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ActivitiesApplicationTests {

	@Autowired
	private Activitymanagement activitymanagement;

	@Test
	public void getActivitiesNoFilterTest() throws IOException {

		List<Activity> activityList = this.activitymanagement.getActivities(new SearchCriteria("madrid", null, "", null));

		assertThat(activityList.size()).isEqualTo(10);
	}

	@Test
	public void getActivitiesWithSomeFilterTest() throws IOException {

		String madrid = "madrid";
		String nature = "shopping";
		String outdoors = "outdoors";

		List<Activity> activityList = this.activitymanagement.getActivities(new SearchCriteria(madrid, nature, outdoors, null));

		assertThat(activityList.size()).isEqualTo(2);
	}

	@Test
	public void getActivitiesWithAllFiltersTest() throws IOException {

		String madrid = "madrid";
		String nature = "nature";
		String outdoors = "outdoors";
		String latina = "Latina";

		List<Activity> activityList = this.activitymanagement.getActivities(new SearchCriteria(madrid, nature, outdoors, latina));

		assertThat(activityList.size()).isEqualTo(1);

		Activity activity = activityList.get(0);
		assertThat(activity.getCategory()).isEqualTo(nature);
		assertThat(activity.getLocation()).isEqualTo(outdoors);
		assertThat(activity.getDistrict()).isEqualTo(latina);
	}

}
