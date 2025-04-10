BEGIN{
print "the data file contain:"
print "User\t Shell"
FS=":"
}
{ print $1 "\t" $7}
END {
print "end of data content"
}
