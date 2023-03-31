.class final Lcom/google/android/gms/internal/ads/t9;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/to;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/ro;

.field private final synthetic b:Lcom/google/android/gms/internal/ads/s8;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/r9;Lcom/google/android/gms/internal/ads/ro;Lcom/google/android/gms/internal/ads/s8;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/t9;->a:Lcom/google/android/gms/internal/ads/ro;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/t9;->b:Lcom/google/android/gms/internal/ads/s8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/t9;->a:Lcom/google/android/gms/internal/ads/ro;

    new-instance v1, Lcom/google/android/gms/internal/ads/f9;

    const-string v2, "Unable to obtain a JavascriptEngine."

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/f9;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/ro;->a(Ljava/lang/Throwable;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/t9;->b:Lcom/google/android/gms/internal/ads/s8;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/s8;->c()V

    return-void
.end method
