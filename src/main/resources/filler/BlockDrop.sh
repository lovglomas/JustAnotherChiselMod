modid="justanotherchiselmod"
blockids=(cloud cloud_grid cloud_large cloud_small cloud_vertical)
dropids=(cloud cloud_grid cloud_large cloud_small cloud_vertical)


clear
cd ..
cd data/$modid/loot_tables/blocks

echo "Auto-completador de .json para definir drops de los bloques"

sleep .5

for ((i=0;i<${#blockids[@]};i++))
do
	touch ${blockids[i]}.json
	echo '{
	"type": "minecraft:block",
	"pools": [{
			"rolls": 1,
			"entries": [{
					"type": "minecraft:item",
					"name": "'$modid:${dropids[i]}'"
				}],
	"conditions": [{
			"condition": "minecraft:survives_explosion"
        }]
		}]
}' >> ${blockids[i]}.json
	echo "Drop configurado para: ${blockids[i]}"
	sleep .5
done
echo "Todos los archivos creados"
