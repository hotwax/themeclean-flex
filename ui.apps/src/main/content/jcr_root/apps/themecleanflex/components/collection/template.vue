<template>
  <themecleanflex-components-block v-bind:model="model">
    <div>
      <h3>{{model.title}}</h3>
      <p>Products in the Collection category will be shown here.</p>
    </div>
  </themecleanflex-components-block>
</template>

<script>
    export default {
        props: ['model']
    }
</script>

