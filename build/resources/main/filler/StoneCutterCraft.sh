modid="justanotherchiselmod"
ingredientids=cloud
resultids=(cloud_grid cloud_large cloud_small cloud_vertical)

clear
cd ..
cd data/$modid/recipes

echo "Auto-completador de .json para definir crafteos con StoneCutter"

sleep .5

for ((i=0;i<${#resultids[@]};i++))
do
	touch ${resultids[i]}.json
	echo '{
	"type": "minecraft:stonecutting",
	"ingredient": {
		"item": "'$modid':'$ingredientids'"
	},
	"result": "'$modid':'${resultids[i]}'",
	"count": 1
}' >> ${resultids[i]}.json

	echo "Creado modelo de item de bloque de: ${resultids[i]}"
	sleep .5
done

echo "Todos los archivos creados"
