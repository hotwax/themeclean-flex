module.exports = {
    convert: function($, f) {
        f.wrap($, 'themecleanflex-components-block')
        f.bindAttribute($.parent(),'model','model')
        let a = $.find('a').first()
        f.addFor( a, 'model.icons')
        f.bindAttribute( a, 'href', f.pathToUrl('item.url'))

        f.bindAttribute( $.find('use'), false, '{\'xlink:href\':`#${item.icon}`}')
        f.bindAttribute( $.find('use'), 'href', '`#${item.icon}`')

        f.addElse($);
        $.parent().prepend('<div class="p-5" v-if="isEditAndEmpty">no content defined for component</div>')
    }
}