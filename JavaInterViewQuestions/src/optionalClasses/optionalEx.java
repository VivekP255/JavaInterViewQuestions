package optionalClasses;

import java.util.Optional;

final class optionalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = null;
		Optional<String> opt = Optional.ofNullable(s);
		System.out.println(opt.isEmpty());
		System.out.println(opt.isPresent());
		//System.out.println(opt.get());
		System.out.println(opt.orElse("No value in this object"));


	}

}
