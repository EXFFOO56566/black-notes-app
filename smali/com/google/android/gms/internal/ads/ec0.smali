.class final synthetic Lcom/google/android/gms/internal/ads/ec0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/l70;


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Lcom/google/android/gms/internal/ads/fo;

.field private final d:Lcom/google/android/gms/internal/ads/id1;

.field private final e:Lcom/google/android/gms/internal/ads/zd1;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/fo;Lcom/google/android/gms/internal/ads/id1;Lcom/google/android/gms/internal/ads/zd1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ec0;->b:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/ec0;->c:Lcom/google/android/gms/internal/ads/fo;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/ec0;->d:Lcom/google/android/gms/internal/ads/id1;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/ec0;->e:Lcom/google/android/gms/internal/ads/zd1;

    return-void
.end method


# virtual methods
.method public final s()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ec0;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ec0;->c:Lcom/google/android/gms/internal/ads/fo;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ec0;->d:Lcom/google/android/gms/internal/ads/id1;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/ec0;->e:Lcom/google/android/gms/internal/ads/zd1;

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->m()Lcom/google/android/gms/internal/ads/hm;

    move-result-object v4

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/fo;->b:Ljava/lang/String;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/id1;->z:Lorg/json/JSONObject;

    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zd1;->f:Ljava/lang/String;

    invoke-virtual {v4, v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/hm;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    return-void
.end method
