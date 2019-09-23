module.exports = {
    convert: function($, f) {
       f.wrap($, 'themecleanflex-components-block')
       f.bindAttribute($.parent(),'model','model')

        f.addFor($.find('div.first').first(), 'model.cards')
       //Title
       f.mapRichField($.find('h2').first(), "item.title")
       //f.mapField($.find('h2'), 'item.text')
       //text
       f.mapRichField($.find('p').first(), "item.text")
       //f.mapField($.find('p'), 'item.text')
        //images
       f.bindAttribute($.find('img').first(), 'src', 'item.image')

    }
}