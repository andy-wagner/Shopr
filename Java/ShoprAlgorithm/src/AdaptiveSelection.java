import java.util.ArrayList;
import java.util.List;

public class AdaptiveSelection {

	public static void main(String[] args) {
		adaptiveSelection();
	}

	/**
	 * Runs one recommendation cycle.
	 */
	private static void adaptiveSelection() {
		itemRecommend(null, null, 15, null, null);
		userReview();
		queryRevise();
	}

	/**
	 * Takes the case-base, current query, number of recommended items to
	 * return, the currently critiqued on item, the carried item. Returns a list
	 * of recommended items.
	 */
	private static List<Item> itemRecommend(List<Item> caseBase, Query query,
			int numItems, Item critiquedItem, Item carriedItem) {
		/*
		 * The caseBase will later be stored in a database (due to its size).
		 * Think about optimizations which could be applied.
		 */
		List<Item> recommendations = new ArrayList<Item>();

		// FIXME: what if the user negatively critiqued the carried item?
		/*
		 * Solution: Instead of checking if it is just equal, also look if it
		 * was critiqued positively/negatively!
		 */
		if (critiquedItem != null && critiquedItem.equals(carriedItem)) {
			/*
			 * Negative progress: user disliked any of the new suggestions or
			 * liked the carried item.
			 */
			recommendations = reFocus();
		} else {
			/*
			 * Positive progress: user liked one of the new suggestions or
			 * disliked the carried item.
			 */
			recommendations = reFine();
		}

		/*
		 * Carry the critiqued item into the next set of recommendations so we
		 * can track positive/negative progress
		 */
		recommendations.add(critiquedItem);

		return recommendations;
	}

	private static List<Item> reFocus() {
		// TODO Auto-generated method stub
		return null;
	}

	private static List<Item> reFine() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Takes the list of recommended items and elicits a critique on a feature
	 * of one item from the user. Returns the liked/disliked item and which
	 * feature value (! not just which feature !) was liked/disliked.
	 */
	private static void userReview() {
		// TODO Auto-generated method stub
	}

	/**
	 * Takes a liked/disliked item, which feature value was liked/disliked, the
	 * current query. Returns a new query modified according to the given user
	 * critique.
	 */
	private static void queryRevise() {
		// TODO Auto-generated method stub

	}

}