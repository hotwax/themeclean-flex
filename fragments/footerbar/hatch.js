module.exports = {
    convert: function($, f) {
        f.wrap($, 'themecleanflex-components-block')
        f.bindAttribute($.parent(),'model','model')

        // Columns
        let col = $.find('.footer-col').first()
        let coltitle = col.find('h1').first()
        let colcontent = col.find('div').first()
        f.addFor( col, "model.columns")
        f.addIf( coltitle, "item.title !== ''")
        f.mapField( coltitle, "item.title")
        f.addIf( colcontent, "item.text !== ''")
        f.mapRichField( colcontent, "item.text")

         // Copyright
        f.mapRichField($.find('p').eq(0), "model.copyright")

        // Social Icons
        let a = $.find('a').first()
        f.addFor( a, 'model.icons')
        f.bindAttribute( a, 'href', f.pathToUrl('item.url'))
        f.bindAttribute( a, 'title', 'item.iconalttext')
        f.bindAttribute( $.find('use'), false, '{\'xlink:href\':`#${item.icon}`}')
        f.bindAttribute( $.find('use'), 'href', '`#${item.icon}`')

        f.addElse($);
        $.parent().prepend('<div class="p-5" v-if="isEditAndEmpty">no content defined for component</div>')
    }
}