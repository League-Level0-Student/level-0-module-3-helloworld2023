package elseif;

import javax.swing.JOptionPane;

public class Horoscope {

	public static void main(String[] args) {
		
		String sign = JOptionPane.showInputDialog("What is your zodiac sign?");
		if (sign.equalsIgnoreCase("aries")){
			JOptionPane.showMessageDialog(null, "Upside: Highly energetic, and has no"
					+ " problem working long hours on a single project. Often take the "
					+ "initiative experiencing new breakthroughs and discoveries. Aries "
					+ "are thorough, painstaking, and have a knack for precise records "
					+ "and clarity. They live hard, love hard, and play hard.\n" + 
					"\n" + 
					"Downside: Aries have tunnel vision when working on a project which "
					+ "can make them seem selfish. They can become impatient with those who "
					+ "are not similar to themselves temperamentally and intellectually. The"
					+ " dedication to a project can become stubbornness, possessiveness, and "
					+ "can lead to a withdrawn and sullen attitude. Many Aries who do not feel "
					+ "acknowledged for their accomplishments become sarcastic and rude.");
		}
		else if (sign.equalsIgnoreCase("taurus")) {
			JOptionPane.showMessageDialog(null, "Upside: Taurus people almost always finish what"
					+ " they start. They are deliberate thinkers and when making decisions usually"
					+ " make the right one. Taurus are generally adaptable, adjusting easily to new"
					+ " circumstances especially if there is the reward of luxury, comfort, or "
					+ "sensual reward. This sign loves to laugh and spend time with family.\n" + 
					"\n" + 
					"Downside: Taurus can be stubborn and ‘bullish’ about ideas that they’ve "
					+ "adopted, which can also make them difficult to get along with when "
					+ "attempting to cooperate on a shared project. Taurus needs to be the leader"
					+ " and to be held in high esteem. If they are not, they refuse to work, often"
					+ " finding small ways to sabotage projects, relationships, or undermine "
					+ "authority that they deem unworthy of leadership.");
		} 
		else if (sign.equalsIgnoreCase("gemini")) {
			JOptionPane.showMessageDialog(null, "Upside: Gemini are great conversationalists, "
					+ "and are charming people. Interesting to speak with, Gemini know a little"
					+ " bit about a lot of things. They have a great sense of humor and are "
					+ "generally optimistic people. Gemini often make their own fun, despising "
					+ "boredom.\n" + 
					"\n" + 
					"Downside: Gemini like to be the center of attention; always. When they "
					+ "perceive the situation to not be in their favor, they leave it. This can "
					+ "include relationships, careers, and friendships. Because of this need to "
					+ "be seen as important, Gemini will sometimes stretch the truth. When they "
					+ "are focused only on themselves they can be largely unsympathetic and rude. "
					+ "Male Gemini tend to change jobs often, and female Gemini change partners "
					+ "often due to boredom.");
		} 
		else if (sign.equalsIgnoreCase("cancer")){
			JOptionPane.showMessageDialog(null, "Upside: Cancer have an offbeat sense of humor, "
					+ "often finding something humorous that others don’t. They are extremely "
					+ "good listeners and have a heart for the problems of others. In fact, many "
					+ "gravitate toward this sign because they intuitively know that a Cancer will"
					+ " understand. When a Cancer becomes your friend you can be sure that they "
					+ "are truly your friend and will not consider using someone to their own "
					+ "benefit. Cancer tend to be dependable and reliable. They will tell you "
					+ "anything you want to know about them without blinking an eye as they are "
					+ "drawn to honesty in others as well as themselves.\n" + 
					"\n" + 
					"Downside: This sign can be moody, clingy, and often become incredibly "
					+ "insecure if they feel that they are about to lose the friendship or love "
					+ "of someone close to them. If the situation calls for it, they will lie, but"
					+ " often this dishonesty stems from a deep insecurity about being alone.");
		}
		else if (sign.equalsIgnoreCase("leo")) {
			JOptionPane.showMessageDialog(null, "Upside: Leo tend to be honest and decent people,"
					+ " opting to do the right thing regardless of the situation. They love "
					+ "organization so that they can find their ‘things’. Leos love material "
					+ "goods and luxury and want those that they love to experience this wealth "
					+ "as well. Leo are generally accepting of everyone initially and make decent, "
					+ "lasting relationships.\n" + 
					"\n" + 
					"Downside: Leo have a great sense of self-worth which can cross the line into"
					+ " arrogance. Leo can tend toward extravagance if they are not satisfied with"
					+ " what they have. Because they like to be in charge, they can often become "
					+ "smothering to their mates and friends, which may leave them alone (which "
					+ "Leo hates). Divorce and loss are devastating to this sign as they are all "
					+ "about the community and family.");
		} 
		else if (sign.equalsIgnoreCase("virgo")) {
			JOptionPane.showMessageDialog(null, "Upside: Virgo have a heart for their fellow man."
					+ " They are kind, patient and love to laugh. They are not loud ‘look at me’ "
					+ "signs, but rather prefer to be the strong, silent type. They are creative "
					+ "thinkers and true family oriented people. Male Virgo, once they are "
					+ "committed to relationship never walk away (unless there is a betrayal, and "
					+ "even then it isn’t written in stone). Female Virgo are dedicated parents, "
					+ "often parenting other children in the neighborhood.\n" + 
					"\n" + 
					"Downside: Virgo are particularly attentive to health; theirs, yours, everyone’s"
					+ ", which can often lead to obsessive behaviors toward health (hypochondria)."
					+ " They can also be judgmental and critical of those that they feel are not "
					+ "living up to their potential, or are going about a project in an inefficient"
					+ " way. Virgo are opinionated and have no problem sharing their opinions, "
					+ "even when they should not.");
		}
		else if (sign.equalsIgnoreCase("libra")) {
			JOptionPane.showMessageDialog(null, "Upside: Libra all have a sense of fair play about"
					+ " them and become completely upset if they perceive that something is unfair"
					+ " or unjust. They are prone to talking for long periods of time about their"
					+ " favorite subjects. Generally the decisions that a Libra makes are the ones"
					+ " that will benefit the most people. Libra are often self-sacrificing for the"
					+ " good of the team or the family.\n" + 
					"\n" + 
					"Downside: Because Libra take so long to make decisions it can be perceived as"
					+ " laziness, or absent- mindedness. Libra, because of their sense of justice"
					+ " and fair play, will often become argumentative to the exclusion of decorum"
					+ " or appropriateness. Libra don’t like to be in charge, but they like to have"
					+ " a say and to be heard.");
		} 
		else if (sign.equalsIgnoreCase("scorpio")) {
			JOptionPane.showMessageDialog(null, message);
		}
		else if (sign.equalsIgnoreCase("sagittarius")) {
			
		} 
		else if (sign.equalsIgnoreCase("capricorn")) {

		}
		else if (sign.equalsIgnoreCase("aquarius")) {
			
		} 
		else if (sign.equalsIgnoreCase("pisces")) {

		}
	}
}
