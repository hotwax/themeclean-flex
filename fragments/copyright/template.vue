<template>
  <themecleanflex-components-block v-bind:model="model">
    <div>
      <p v-html="model.text"></p>
    </div>
  </themecleanflex-components-block>
</template>

<script>
    export default {
        props: ['model']
    }
</script>

