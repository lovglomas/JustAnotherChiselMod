modid="justanotherchiselmod"
itemids=(chisel soga eso)
textureids=(chisels ese sonia)

clear
cd ..
cd assets/$modid/models/item

echo "Auto-completador de .json para definir texturas de los items"

sleep .5

for ((i=0;i<${#itemids[@]};i++))
do
	touch ${itemids[i]}.json
		echo '{
	"parent": "minecraft:item/generated",
	"textures": {
		"layer0": "'$modid':item/'${textureids[i]}'"
	}
}' >> ${itemids[i]}.json
	echo "testura creada para: ${itemids[i]}"
	sleep .5
done

cd ..
cd ..
cd ..
echo "Todos los archivos creados"
