#!/bin/sh

# echo "DataFlow.svg --export-png=foo.png" | inkscape --shell

for i in *png; do
	cp $i ../../org.discode.task.edit/icons/full/obj16/`basename $i .png`.gif;
done
