module.exports = {
    convert: function($, f) {
        f.bindPath($)
        f.addFor($.find('div.first').first(), 'model.cards')
       //Title
        f.mapRichField($.find('h2').first(), "item.title")
       //text
        f.mapRichField($.find('p').first(), "item.text")
    }
}