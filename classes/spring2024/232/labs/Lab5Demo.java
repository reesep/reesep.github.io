
public class Lab5Demo {

	public static void main(String[] args) {
		
		// To do Part 1: Define the EmojiTranslator class and the loadHashMap() method.
		EmojiTranslator translator = new EmojiTranslator();
		
		// To do Part 2: Define the convert() method
		String answer = translator.convert("Go Cats Go! :CatFaceWithWrySmile: Go Cats Go! :CatFaceWithWrySmile: :FlexedBiceps: :GrinningFace:");
		System.out.println(answer);
		
		answer = translator.convert("Hey Bestie :WomanDancing: want to get some drinks tonight? :Eyes: :WineGlass:");
		System.out.println(answer);
		
		answer = translator.convert(":AlarmClock: :AlarmClock: :AlarmClock: Wake up!! The grind never stops :CowboyHatFace: :ThumbsUp: ");
		System.out.println(answer);
		
		// To do Part 3: Define the getEmoji() method
		System.out.println(translator.getEmoji("Blossom"));
		System.out.println(translator.getEmoji("Penguin"));
		System.out.println(translator.getEmoji("Taco"));
		System.out.println(translator.getEmoji("Bobcat"));
	}

}
