# mosip-sbi-capacitor-plugin

Capacitor plugin to use Android Intent with SBI

## Install

```bash
npm install mosip-sbi-capacitor-plugin
npx cap sync
```

## API

<docgen-index>

* [`startActivity(...)`](#startactivity)
* [Interfaces](#interfaces)

</docgen-index>


<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### startActivity(...)

```typescript
startActivity(options: CapacitorIntentOptions) => Promise<void>
```

| Param         | Type                                                                      |
| ------------- | ------------------------------------------------------------------------- |
| **`options`** | <code><a href="#capacitorintentoptions">CapacitorIntentOptions</a></code> |

--------------------


### Interfaces


#### CapacitorIntentOptions

| Prop               | Type                |
| ------------------ | ------------------- |
| **`url`**          | <code>string</code> |
| **`methodType`**   | <code>string</code> |
| **`action`**       | <code>string</code> |
| **`requestKey`**   | <code>string</code> |
| **`requestValue`** | <code>string</code> |

</docgen-api>
