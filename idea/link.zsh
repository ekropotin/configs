SCRIPT_PATH=`dirname "$0"`; SCRIPT_PATH=`eval "cd \"$SCRIPT_PATH\" && pwd"`

fold[1]="codestyles"
fold[2]="fileTemplates"
fold[3]="inspection"
fold[4]="templates"

if [ $# -ne 1 ]
then
    echo "usage: "$0" <path_to_idea_config>"
    exit 1
fi

conf_dir=$1

if [ ! -d $conf_dir ]
then
    echo "${conf_dir} does not exist!"
    exit 1
fi

echo "Warning! All your current idea settings will be erased and linked to the repo. Are your sure? (y/n)"
read answer
if [[ $answer != "y" ]];
then
	exit 1;
fi

for i in $fold
do
    rm -rf $conf_dir/$i
    ln -s $SCRIPT_PATH/config/$i $conf_dir/$i
done

