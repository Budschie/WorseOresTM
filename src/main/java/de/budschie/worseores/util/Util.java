package de.budschie.worseores.util;

import java.util.Collection;
import java.util.Optional;
import java.util.Random;

public class Util
{
	public static <E> Optional<E> getRandom (Collection<E> e, Random rand) 
	{
	    return e.stream()
	            .skip(rand.nextInt(e.size()))
	            .findFirst();
	}
}
