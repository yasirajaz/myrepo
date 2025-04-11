#!/bin/bash
cat<<- _EOF_
<!DOCTYPE html>
	<html>
		<head>
			<title> MY PAGE</title>
		</head>
		<body>
			<h4> $(ls -l) </h4>
		</body>
	</html>
_EOF_
