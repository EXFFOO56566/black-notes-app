.class final synthetic Lcom/google/android/gms/internal/ads/vu;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/nl1;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/google/android/gms/internal/ads/lu;

.field private final c:Ljava/lang/String;

.field private final d:Z

.field private final e:Z

.field private final f:Lcom/google/android/gms/internal/ads/eq1;

.field private final g:Lcom/google/android/gms/internal/ads/fo;

.field private final h:Lcom/google/android/gms/internal/ads/o;

.field private final i:Lcom/google/android/gms/ads/internal/i;

.field private final j:Lcom/google/android/gms/ads/internal/a;

.field private final k:Lcom/google/android/gms/internal/ads/wj2;

.field private final l:Lcom/google/android/gms/internal/ads/yi2;

.field private final m:Z


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/lu;Ljava/lang/String;ZZLcom/google/android/gms/internal/ads/eq1;Lcom/google/android/gms/internal/ads/fo;Lcom/google/android/gms/internal/ads/o;Lcom/google/android/gms/ads/internal/i;Lcom/google/android/gms/ads/internal/a;Lcom/google/android/gms/internal/ads/wj2;Lcom/google/android/gms/internal/ads/yi2;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/vu;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/vu;->b:Lcom/google/android/gms/internal/ads/lu;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/vu;->c:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/google/android/gms/internal/ads/vu;->d:Z

    iput-boolean p5, p0, Lcom/google/android/gms/internal/ads/vu;->e:Z

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/vu;->f:Lcom/google/android/gms/internal/ads/eq1;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/vu;->g:Lcom/google/android/gms/internal/ads/fo;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/vu;->h:Lcom/google/android/gms/internal/ads/o;

    iput-object p9, p0, Lcom/google/android/gms/internal/ads/vu;->i:Lcom/google/android/gms/ads/internal/i;

    iput-object p10, p0, Lcom/google/android/gms/internal/ads/vu;->j:Lcom/google/android/gms/ads/internal/a;

    iput-object p11, p0, Lcom/google/android/gms/internal/ads/vu;->k:Lcom/google/android/gms/internal/ads/wj2;

    iput-object p12, p0, Lcom/google/android/gms/internal/ads/vu;->l:Lcom/google/android/gms/internal/ads/yi2;

    iput-boolean p13, p0, Lcom/google/android/gms/internal/ads/vu;->m:Z

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/vu;->a:Landroid/content/Context;

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/vu;->b:Lcom/google/android/gms/internal/ads/lu;

    iget-object v6, v0, Lcom/google/android/gms/internal/ads/vu;->c:Ljava/lang/String;

    iget-boolean v7, v0, Lcom/google/android/gms/internal/ads/vu;->d:Z

    iget-boolean v15, v0, Lcom/google/android/gms/internal/ads/vu;->e:Z

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/vu;->f:Lcom/google/android/gms/internal/ads/eq1;

    iget-object v10, v0, Lcom/google/android/gms/internal/ads/vu;->g:Lcom/google/android/gms/internal/ads/fo;

    iget-object v11, v0, Lcom/google/android/gms/internal/ads/vu;->h:Lcom/google/android/gms/internal/ads/o;

    iget-object v12, v0, Lcom/google/android/gms/internal/ads/vu;->i:Lcom/google/android/gms/ads/internal/i;

    iget-object v13, v0, Lcom/google/android/gms/internal/ads/vu;->j:Lcom/google/android/gms/ads/internal/a;

    iget-object v14, v0, Lcom/google/android/gms/internal/ads/vu;->k:Lcom/google/android/gms/internal/ads/wj2;

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/vu;->l:Lcom/google/android/gms/internal/ads/yi2;

    iget-boolean v4, v0, Lcom/google/android/gms/internal/ads/vu;->m:Z

    new-instance v3, Lcom/google/android/gms/internal/ads/pu;

    invoke-direct {v3}, Lcom/google/android/gms/internal/ads/pu;-><init>()V

    new-instance v2, Lcom/google/android/gms/internal/ads/nu;

    invoke-direct {v2, v1}, Lcom/google/android/gms/internal/ads/nu;-><init>(Landroid/content/Context;)V

    new-instance v1, Lcom/google/android/gms/internal/ads/uu;

    move-object/from16 v16, v2

    move-object v2, v1

    move-object/from16 v17, v3

    move-object/from16 v3, v16

    move/from16 v16, v4

    move-object/from16 v4, v17

    move-object/from16 v18, v8

    move v8, v15

    move v0, v15

    move-object/from16 v15, v18

    invoke-direct/range {v2 .. v16}, Lcom/google/android/gms/internal/ads/uu;-><init>(Lcom/google/android/gms/internal/ads/nu;Lcom/google/android/gms/internal/ads/pu;Lcom/google/android/gms/internal/ads/lu;Ljava/lang/String;ZZLcom/google/android/gms/internal/ads/eq1;Lcom/google/android/gms/internal/ads/fo;Lcom/google/android/gms/internal/ads/o;Lcom/google/android/gms/ads/internal/i;Lcom/google/android/gms/ads/internal/a;Lcom/google/android/gms/internal/ads/wj2;Lcom/google/android/gms/internal/ads/yi2;Z)V

    new-instance v2, Lcom/google/android/gms/internal/ads/ht;

    invoke-direct {v2, v1}, Lcom/google/android/gms/internal/ads/ht;-><init>(Lcom/google/android/gms/internal/ads/ws;)V

    new-instance v3, Lcom/google/android/gms/internal/ads/os;

    invoke-direct {v3, v2}, Lcom/google/android/gms/internal/ads/os;-><init>(Lcom/google/android/gms/internal/ads/ws;)V

    invoke-virtual {v1, v3}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    move-object/from16 v1, v17

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/ads/pu;->a(Lcom/google/android/gms/internal/ads/ws;Z)V

    return-object v2
.end method
