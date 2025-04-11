BEGIN{
var["a"]="ahemdabad"
var["b"]="bengaluru"
var["c"]="chennai"
var["d"]="dhanbad"
delete var["c]" 
for (test in var) {
print "Index:",test, "value:" var[test]
}
}
