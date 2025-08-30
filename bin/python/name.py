def formatted_name(first,last,middle=''):
	if middle:
		name=f"{first} {middle} {last}"
	else:
		name=f"{first} {last}"
	return name.title()

