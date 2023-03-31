.class final synthetic Lcom/google/android/gms/internal/ads/at0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/zg1;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/bt0;

.field private final b:Z

.field private final c:Ljava/util/ArrayList;

.field private final d:Lcom/google/android/gms/internal/ads/zk2;

.field private final e:Lcom/google/android/gms/internal/ads/bl2$c;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/bt0;ZLjava/util/ArrayList;Lcom/google/android/gms/internal/ads/zk2;Lcom/google/android/gms/internal/ads/bl2$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/at0;->a:Lcom/google/android/gms/internal/ads/bt0;

    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/at0;->b:Z

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/at0;->c:Ljava/util/ArrayList;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/at0;->d:Lcom/google/android/gms/internal/ads/zk2;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/at0;->e:Lcom/google/android/gms/internal/ads/bl2$c;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/at0;->a:Lcom/google/android/gms/internal/ads/bt0;

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/at0;->b:Z

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/at0;->c:Ljava/util/ArrayList;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/at0;->d:Lcom/google/android/gms/internal/ads/zk2;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/at0;->e:Lcom/google/android/gms/internal/ads/bl2$c;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/bt0;->b:Lcom/google/android/gms/internal/ads/xs0;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/xs0;->a(Lcom/google/android/gms/internal/ads/xs0;ZLjava/util/ArrayList;Lcom/google/android/gms/internal/ads/zk2;Lcom/google/android/gms/internal/ads/bl2$c;)[B

    move-result-object v0

    new-instance v2, Landroid/content/ContentValues;

    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    invoke-static {}, Lcom/google/android/gms/ads/internal/q;->j()Lcom/google/android/gms/common/util/d;

    move-result-object v3

    invoke-interface {v3}, Lcom/google/android/gms/common/util/d;->a()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "timestamp"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v3, "serialized_proto_data"

    invoke-virtual {v2, v3, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    const/4 v0, 0x0

    const-string v3, "offline_signal_contents"

    invoke-virtual {p1, v3, v0, v2}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Object;

    const-string v4, "total_requests"

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const-string v4, "UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = \'%s\'"

    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    if-nez v1, :cond_0

    new-array v1, v2, [Ljava/lang/Object;

    const-string v2, "failed_requests"

    aput-object v2, v1, v5

    invoke-static {v4, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method
